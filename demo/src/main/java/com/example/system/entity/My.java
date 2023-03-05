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
@TableName("my")
@Entity
public class My implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private double price;

    private String image;

    private Integer status;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "My{" +
            "id=" + id +
            ", title=" + title +
            ", price=" + price +
            ", Image=" + image +
            ", status=" + status +
        "}";
    }
}
