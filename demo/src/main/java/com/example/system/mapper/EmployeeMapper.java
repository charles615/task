package com.example.system.mapper;

import com.example.system.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    int insert(Employee employee);
    Employee findByUsername(String username);

    Integer reset(Employee employee);


}
