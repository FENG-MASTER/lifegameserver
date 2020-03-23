package com.fengmaster.lifegameserver.controller;

import com.fengmaster.lifegameserver.model.dto.BaseResponse;
import com.fengmaster.lifegameserver.model.po.Player;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Feng-master on 20/03/18.
 */
@RestController
@RequestMapping(value = "/api/v1/lifeGame")
public class PlayerController {

    @ApiOperation(value = "玩家注册",notes = "新玩家注册接口")
    @PostMapping(value = "/player")
    public void register(@RequestBody @ApiParam(value = "要注册的玩家信息") Player player){


    }

    @ApiOperation(value = "查询玩家信息",notes = "查询玩家信息")
    @GetMapping(value = "/player")
    public BaseResponse<Player> getPlayerInfo(@RequestParam @ApiParam(value = "玩家UID") String[] uid){


        return null;
    }


    @ApiOperation(value = "更新玩家信息",notes = "更新玩家信息")
    @PutMapping(value = "/player")
    public BaseResponse updatePlayerInfo(@RequestBody @ApiParam(value = "更新的玩家信息") Player player,@RequestParam String paasword){


    }






}
