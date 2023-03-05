package com.example.system.entity;


import com.baomidou.mybatisplus.annotation.TableName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
@TableName("cart")
@Entity
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer phone_id;

    private Integer user_id;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(Integer phone_id) {
        this.phone_id = phone_id;
    }


    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }


    @Override
    public String toString() {
        return "Cart{" +
            "id=" + id +
            ", phone_id=" + phone_id +
            ", user_id=" + user_id +
        "}";
    }
}
