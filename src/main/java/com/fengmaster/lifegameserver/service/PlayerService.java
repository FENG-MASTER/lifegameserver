package com.fengmaster.lifegameserver.service;

import com.fengmaster.lifegameserver.mapper.PlayerMapper;
import com.fengmaster.lifegameserver.model.po.Player;
import com.fengmaster.lifegameserver.service.impl.IPlayerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Feng-master on 20/03/23.
 */
@Log4j2
public class PlayerService implements IPlayerService {

    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public void register(Player player) {


    }
}
