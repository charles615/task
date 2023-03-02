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
@TableName("phone")
@Entity
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private double price;

    private String image;

    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", title=" + title +
            ", price=" + price +
            ", Image=" + image +
            ", content=" + content +
            ", status=" + status +
        "}";
    }
}
