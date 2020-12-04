package com.fengmaster.lifegameserver.interfaces.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fengmaster.lifegameserver.infrastructure.common.util.UserUtil;
import com.fengmaster.lifegameserver.interfaces.model.CreateCharacterDto;
import com.fengmaster.lifegameserver.domain.model.entity.LgCharacter;
import com.fengmaster.lifegameserver.infrastructure.service.LgCharacterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 玩家(LgCharacter)表控制层
 *
 * @author makejava
 * @since 2020-09-01 15:51:39
 */
@Tag(name = "玩家角色接口")
@RestController
@RequestMapping("/api/v1/character")
public class CharacterController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private LgCharacterService lgCharacterService;

    /**
     * 新增角色
     *
     * @param createCharacterDto 实体对象
     * @return 新增结果
     */
    @PostMapping
    @Operation(summary = "新增玩家角色")
    public void createCharacter(@RequestBody CreateCharacterDto createCharacterDto) {
        this.lgCharacterService.createCharacterAndWorld(createCharacterDto);
    }

    /**
     * 分页查询玩家所有角色
     *
     * @param page        分页对象
     * @return 所有数据
     */
    @GetMapping
    @Operation(summary = "查询玩家所有角色（分页)")
    public Page<LgCharacter> selectAll(Page<LgCharacter> page) {
        return this.lgCharacterService.page(page, new QueryWrapper<>(new LgCharacter().setUserUuid(UserUtil.getCurrentUser().getUuid())));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.lgCharacterService.getById(id));
    }



    /**
     * 修改数据
     *
     * @param lgCharacter 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody LgCharacter lgCharacter) {
        return success(this.lgCharacterService.updateById(lgCharacter));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.lgCharacterService.removeByIds(idList));
    }
}