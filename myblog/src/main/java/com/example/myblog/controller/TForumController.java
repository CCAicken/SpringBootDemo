package com.example.myblog.controller;

import com.example.myblog.entity.TForum;
import com.example.myblog.service.TForumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TForum)表控制层
 *
 * @author makejava
 * @since 2019-12-31 16:21:36
 */
@RestController
@RequestMapping("tForum")
public class TForumController {
    /**
     * 服务对象
     */
    @Resource
    private TForumService tForumService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TForum selectOne(Integer id) {
        return this.tForumService.queryById(id);
    }

}