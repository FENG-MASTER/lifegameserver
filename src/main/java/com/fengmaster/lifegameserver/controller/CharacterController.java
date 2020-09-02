package com.fengmaster.lifegameserver.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fengmaster.lifegameserver.model.dto.CreateCharacterDto;
import com.fengmaster.lifegameserver.model.po.LgCharacter;
import com.fengmaster.lifegameserver.service.LgCharacterService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.shiro.authz.annotation.RequiresUser;
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
@RequestMapping("/api/character")
public class CharacterController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private LgCharacterService lgCharacterService;

    /**
     * 新增数据
     *
     * @param createCharacterDto 实体对象
     * @return 新增结果
     */
    @PostMapping
    public void createCharacter(@RequestBody CreateCharacterDto createCharacterDto) {
        this.lgCharacterService.createCharacter(createCharacterDto);
    }

    /**
     * 分页查询所有数据
     *
     * @param page        分页对象
     * @param lgCharacter 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<LgCharacter> page, LgCharacter lgCharacter) {
        return success(this.lgCharacterService.page(page, new QueryWrapper<>(lgCharacter)));
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