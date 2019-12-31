package com.example.myblog.controller;

import com.example.myblog.entity.VForum;
import com.example.myblog.service.VForumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (VForum)表控制层
 *
 * @author makejava
 * @since 2019-12-31 16:23:09
 */
@RestController
@RequestMapping("vForum")
public class VForumController {
    /**
     * 服务对象
     */
    @Resource
    private VForumService vForumService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VForum selectOne( Integer id) {
        return this.vForumService.queryById(id);
    }

}