package com.project.poseid_server.service.seller.discount.update;

import com.project.poseid_server.adapter.database.MysqlDriver;
import com.project.poseid_server.model.discount.Discount;
import com.project.poseid_server.service.exception.UpdateDiscountErrorException;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UpdateSellerDiscountUseCase {
    @Autowired
    private MysqlDriver mysqlDriver;

    public UpdateSellerDiscountUseCase(MysqlDriver mysqlDriver){
        this.mysqlDriver = mysqlDriver;
    }

    public void execute(UpdateSellerDiscountUseCaseInput input, UpdateSellerDiscountUseCaseOutput output) throws UpdateDiscountErrorException {
        //code
        /*"update `discount` SET `value`=?,`code`=?,`name`=?,
        `startDate`=?,`endDate`=? WHERE id=?  */
    }
}