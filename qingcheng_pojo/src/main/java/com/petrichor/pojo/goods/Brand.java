package com.petrichor.pojo.goods;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * 商品品牌实体类
 *
 * @author Silhouette
 * @date 2020-11-20
 * */
@Table(name="tb_brand")
public class Brand implements Serializable {
    /**
     * id
     * */
    private Integer id;

    /**
     * 品牌名称
     * */
    private String name;

    /**
     * 品牌logo
     * */
    private String image;

    /**
     * 首字母
     * */
    private String letter;

    /**
     * 排序
     * */
    private Integer seq;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}
