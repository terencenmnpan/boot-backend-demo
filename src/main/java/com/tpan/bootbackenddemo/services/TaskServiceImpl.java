package com.tpan.bootbackenddemo.services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional(rollbackOn = Exception.class)
public class TaskServiceImpl implements TaskService{

}
