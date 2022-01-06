package com.project.poseid_server.service.user.order.item.update;

import com.project.poseid_server.adapter.database.MysqlDriver;
import com.project.poseid_server.service.exception.UpdateOrderErrorException;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UpdateOrderUseCase {
    @Autowired
    private MysqlDriver mysqlDriver;

    public UpdateOrderUseCase(MysqlDriver mysqlDriver) {
        this.mysqlDriver = mysqlDriver;
    }

    public void execute(UpdateOrderUseCaseInput input, UpdateOrderUseCaseOutput output) throws UpdateOrderErrorException {
        //code
    }
}