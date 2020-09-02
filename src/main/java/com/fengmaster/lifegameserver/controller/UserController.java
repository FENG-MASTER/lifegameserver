package com.fengmaster.lifegameserver.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fengmaster.lifegameserver.model.po.LgUser;
import com.fengmaster.lifegameserver.service.LgUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.ValidationException;
import java.io.Serializable;
import java.util.List;

/**
 * 玩家(LgUser)表控制层
 *
 * @author makejava
 * @since 2020-08-31 11:04:08
 */
@Tag(name = "玩家接口")
@RestController
@RequestMapping("/api/player")
public class UserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private LgUserService lgUserService;


    /**
     * 新增数据
     *
     * @param lgUser 实体对象
     * @return 新增结果
     */
    @Operation(summary = "玩家注冊",description = "会自动生成唯一ID")
    @PostMapping
    public R register(@RequestBody LgUser lgUser) {
        return success(this.lgUserService.register(lgUser));
    }

    /**
     * 修改数据
     *
     * @param lgUser 实体对象
     * @return 修改结果
     */
    @Operation(summary = "修改玩家信息",description = "修改玩家信息")
    @PutMapping
    public R update(@RequestBody LgUser lgUser) {
        return success(this.lgUserService.updateById(lgUser));
    }

    @Operation(summary = "登录",description = "登录")
    @PostMapping("/login")
    public void login(@Parameter(description = "用户名") @RequestParam String userName,
                   @Parameter(description = "密码") @RequestParam String password){
        lgUserService.login(userName,password);
    }

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param lgUser 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<LgUser> page, LgUser lgUser) {
        return success(this.lgUserService.page(page, new QueryWrapper<>(lgUser)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.lgUserService.getById(id));
    }



    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.lgUserService.removeByIds(idList));
    }
}