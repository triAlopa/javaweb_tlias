package com.author.chen.service.impl;

import com.author.chen.Exception.HavPersonException;
import com.author.chen.mapper.ClazzMapper;
import com.author.chen.mapper.StudentMapper;
import com.author.chen.pojo.Clazz;
import com.author.chen.pojo.ClazzQueryParam;
import com.author.chen.pojo.PageResult;
import com.author.chen.service.ClazzService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


/**
 * 班级服务实现类，实现ClazzService接口
 * 提供班级的增删改查等业务逻辑处理
 */
@Service
public class ClazzServiceImpl implements ClazzService {
    // 自动注入班级数据访问层
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private StudentMapper studentMapper;


    /**
     * 保存班级信息
     *
     * @param clazz 班级对象
     */
    @Override
    public void save(Clazz clazz) {
        // 设置创建时间和更新时间为当前时间
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(LocalDateTime.now());
        // 调用数据访问层保存班级信息
        clazzMapper.save(clazz);
    }

    /**
     * 查询所有班级信息
     *
     * @return 返回所有班级列表
     */
    @Override
    public List<Clazz> findAll() {
        // 调用数据访问层查询所有班级信息
        return clazzMapper.findAll();
    }

    /**
     * 根据参数查询班级信息并分页
     *
     * @param clazzQueryParam 班级查询参数对象
     * @return 返回分页结果，包含总记录数和当前页数据
     */
    @Override
    public PageResult<Clazz> queryByParam(ClazzQueryParam clazzQueryParam) {

        // 获取分页参数
        Integer page = clazzQueryParam.getPage();
        Integer pagSize = clazzQueryParam.getPagSize();

        // 使用PageHelper设置分页参数
        PageHelper.startPage(page, pagSize);

        // 调用数据访问层查询班级信息
        Page<Clazz> clazzPage = (Page<Clazz>) clazzMapper.queryByParam(clazzQueryParam);

        // 根据当前日期设置班级状态
        clazzPage.forEach(s -> {
            LocalDate begin = s.getBeginDate();
            if (LocalDate.now().isBefore(begin)) s.setStatus("未开课");
            else if (LocalDate.now().isAfter(s.getEndDate())) s.setStatus("已结课");
            else s.setStatus("在读");
        });

        // 返回分页结果
        return new PageResult<>(clazzPage.getTotal(), clazzPage.getResult());
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void del(Integer id) {
        Integer StuCount = studentMapper.getCountByClazzId(id);

        if (StuCount > 0) throw new HavPersonException("该班级还有学生");

        clazzMapper.del(id);
    }

    @Override
    public Clazz info(Integer id) {
        Clazz clazz = clazzMapper.info(id);
        LocalDate begin = clazz.getBeginDate();
        if (LocalDate.now().isBefore(begin)) clazz.setStatus("未开课");
        else if (LocalDate.now().isAfter(clazz.getEndDate())) clazz.setStatus("已结课");
        else clazz.setStatus("在读");

        return clazz;
    }

    @Override
    public void update(Clazz clazz) {
        clazz.setUpdateTime(LocalDateTime.now());

        clazzMapper.update(clazz);
    }
}
