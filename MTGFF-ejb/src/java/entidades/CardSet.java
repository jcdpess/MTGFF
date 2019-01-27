/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jcdpess
 */
import java.io.Serializable;
import javax.persistence.Column;
//import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card_set", schema = "public")
public class CardSet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CS_CODE")
    private String code;
    @Column(name = "CS_NAME")
    private String name;
//    private String gathererCode;
//    private String oldCode;
//    private String magicCardsInfoCode;
    @Column(name = "CS_RELEASE_DATE")
    private String releaseDate;
//    private String border;
    @Column(name = "CS_TYPE")
    private String type;
//    private String block;
//    private Boolean onlineOnly;
//    private List<Object> booster;
//    private List<Card> cards;

    @Override
    public String toString() {
        return "CardSet{" + "name=" + name + ", code=" + code + ", releaseDate=" + releaseDate + ", type=" + type + '}';
    }

    //<editor-fold defaultstate="collapsed" desc="Getters y setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

//    public String getGathererCode() {
//        return gathererCode;
//    }
//
//    public void setGathererCode(String gathererCode) {
//        this.gathererCode = gathererCode;
//    }
//
//    public String getOldCode() {
//        return oldCode;
//    }
//
//    public void setOldCode(String oldCode) {
//        this.oldCode = oldCode;
//    }
//
//    public String getMagicCardsInfoCode() {
//        return magicCardsInfoCode;
//    }
//
//    public void setMagicCardsInfoCode(String magicCardsInfoCode) {
//        this.magicCardsInfoCode = magicCardsInfoCode;
//    }
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

//    public String getBorder() {
//        return border;
//    }
//
//    public void setBorder(String border) {
//        this.border = border;
//    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public String getBlock() {
//        return block;
//    }
//
//    public void setBlock(String block) {
//        this.block = block;
//    }
//
//    public Boolean getOnlineOnly() {
//        return onlineOnly;
//    }
//
//    public void setOnlineOnly(Boolean onlineOnly) {
//        this.onlineOnly = onlineOnly;
//    }
//
//    public List<Object> getBooster() {
//        return booster;
//    }
//
//    public void setBooster(List<Object> booster) {
//        this.booster = booster;
//    }
//
//    public List<Card> getCards() {
//        return cards;
//    }
//
//    public void setCards(List<Card> cards) {
//        this.cards = cards;
//    }
    //</editor-fold>
}
