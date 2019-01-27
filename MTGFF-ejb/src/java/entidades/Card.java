/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

//import reglasylegality.Ruling;
//import reglasylegality.Legality;
import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.Column;
//import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jcdpess
 */
@Entity
@Table(name = "card", schema = "public")
public class Card implements Serializable {

    private static final long serialVersionUID = 1L;

//    private String id;
//    private String layout;
//    private String name;
    @Column(name = "C_NAMES")
    private String[] cardNames;
    @Column(name = "C_MANA_COST")
    private String manaCost;
    @Column(name = "C_CMC")
    private Double cmc;
    @Column(name = "C_COLORS")
    private String[] colors;
    @Column(name = "C_COLOR_IDENTITY")
    private String[] colorIdentity;
//    private String type;
//    private String[] supertypes;
    @Column(name = "C_TYPES")
    private String[] types;
//    private String[] subtypes;
    @Column(name = "C_RARITY")
    private String rarity;
    @Column(name = "C_TEXT")
    private String text;
//    private String originalText;
//    private String flavor;
//    private String artist;
    @Column(name = "C_NUMBER")
    private String number;
    @Column(name = "C_POWER")
    private String power;
    @Column(name = "C_TOUGHNESS")
    private String toughness;
    @Column(name = "C_LOYALTY")
    private String loyalty;
    @Id
    @Column(name = "C_MULTIVERSE_ID")
    private Integer multiverseid;
//    private String[] variations;
//    private String imageName;
//    private String watermark;
//    private String border;
//    private Boolean timeshifted;
//    private Integer hand;
//    private Integer life;
//    private Boolean reserved;
//    private String releaseDate;
//    private Boolean starter;
    @Column(name = "C_SET_LIST")
    private String[] setList;
//    private String setName;
//    private String[] printings;
//    private String imageUrl;
//    private Legality[] legalities;
//    private BigDecimal priceHigh;
//    private BigDecimal priceMid;
//    private BigDecimal priceLow;
//    private BigDecimal onlinePriceHigh;
//    private BigDecimal onlinePriceMid;
//    private BigDecimal onlinePriceLow;
//    private Ruling[] rulings;

    //<editor-fold defaultstate="collapsed" desc="Getters and setters">
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//    public String getLayout() {
//        return layout;
//    }
//
//    public void setLayout(String layout) {
//        this.layout = layout;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    public String[] getNames() {
        return cardNames;
    }

    public void setNames(String[] names) {
        this.cardNames = names;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public Double getCmc() {
        return cmc;
    }

    public void setCmc(Double cmc) {
        this.cmc = cmc;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String[] getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(String[] colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String[] getSupertypes() {
//        return supertypes;
//    }
//
//    public void setSupertypes(String[] supertypes) {
//        this.supertypes = supertypes;
//    }
    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

//    public String[] getSubtypes() {
//        return subtypes;
//    }
//
//    public void setSubtypes(String[] subtypes) {
//        this.subtypes = subtypes;
//    }
    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public String getOriginalText() {
//        return originalText;
//    }
//
//    public void setOriginalText(String originalText) {
//        this.originalText = originalText;
//    }
//
//    public String getFlavor() {
//        return flavor;
//    }
//
//    public void setFlavor(String flavor) {
//        this.flavor = flavor;
//    }
//
//    public String getArtist() {
//        return artist;
//    }
//
//    public void setArtist(String artist) {
//        this.artist = artist;
//    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public Integer getMultiverseid() {
        return multiverseid;
    }

    public void setMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
    }

//    public String[] getVariations() {
//        return variations;
//    }
//
//    public void setVariations(String[] variations) {
//        this.variations = variations;
//    }
//
//    public String getImageName() {
//        return imageName;
//    }
//
//    public void setImageName(String imageName) {
//        this.imageName = imageName;
//    }
//
//    public String getWatermark() {
//        return watermark;
//    }
//
//    public void setWatermark(String watermark) {
//        this.watermark = watermark;
//    }
//
//    public String getBorder() {
//        return border;
//    }
//
//    public void setBorder(String border) {
//        this.border = border;
//    }
//
//    public Boolean getTimeshifted() {
//        return timeshifted;
//    }
//
//    public void setTimeshifted(Boolean timeshifted) {
//        this.timeshifted = timeshifted;
//    }
//
//    public Integer getHand() {
//        return hand;
//    }
//
//    public void setHand(Integer hand) {
//        this.hand = hand;
//    }
//    public Integer getLife() {
//        return life;
//    }
//
//    public void setLife(Integer life) {
//        this.life = life;
//    }
//
//    public Boolean getReserved() {
//        return reserved;
//    }
//
//    public void setReserved(Boolean reserved) {
//        this.reserved = reserved;
//    }
//    public String getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(String releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public Boolean getStarter() {
//        return starter;
//    }
//
//    public void setStarter(Boolean starter) {
//        this.starter = starter;
//    }
//    /**
//     * @return the setCode
//     */
    /**
     * @return the setList
     */
    public String[] getSetList() {
        return setList;
    }

    /**
     * @param setList the setList to set
     */
    public void setSetList(String[] setList) {
        this.setList = setList;
    }
//
//    public String getSetName() {
//        return setName;
//    }
//
//    public void setSetName(String setName) {
//        this.setName = setName;
//    }

//    public String[] getPrintings() {
//        return printings;
//    }
//
//    public void setPrintings(String[] printings) {
//        this.printings = printings;
//    }
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public Legality[] getLegalities() {
//        return legalities;
//    }
//
//    public void setLegalities(Legality[] legalities) {
//        this.legalities = legalities;
//    }
//
//    public BigDecimal getPriceHigh() {
//        return priceHigh;
//    }
//
//    public void setPriceHigh(BigDecimal priceHigh) {
//        this.priceHigh = priceHigh;
//    }
//
//    public BigDecimal getPriceMid() {
//        return priceMid;
//    }
//
//    public void setPriceMid(BigDecimal priceMid) {
//        this.priceMid = priceMid;
//    }
//
//    public BigDecimal getPriceLow() {
//        return priceLow;
//    }
//
//    public void setPriceLow(BigDecimal priceLow) {
//        this.priceLow = priceLow;
//    }
//
//    public BigDecimal getOnlinePriceHigh() {
//        return onlinePriceHigh;
//    }
//
//    public void setOnlinePriceHigh(BigDecimal onlinePriceHigh) {
//        this.onlinePriceHigh = onlinePriceHigh;
//    }
//
//    public BigDecimal getOnlinePriceMid() {
//        return onlinePriceMid;
//    }
//
//    public void setOnlinePriceMid(BigDecimal onlinePriceMid) {
//        this.onlinePriceMid = onlinePriceMid;
//    }
//
//    public BigDecimal getOnlinePriceLow() {
//        return onlinePriceLow;
//    }
//
//    public void setOnlinePriceLow(BigDecimal onlinePriceLow) {
//        this.onlinePriceLow = onlinePriceLow;
//    }
//
//    public Ruling[] getRulings() {
//        return rulings;
//    }
//
//    public void setRulings(Ruling[] rulings) {
//        this.rulings = rulings;
//    }
    //</editor-fold>
    @Override
    public String toString() {
        return "Card{" + "cardNames=" + Arrays.toString(cardNames) + ", manaCost=" + manaCost + ", cmc=" + cmc + ", colors=" + Arrays.toString(colors) + ", colorIdentity=" + Arrays.toString(colorIdentity) + ", types=" + Arrays.toString(types) + ", rarity=" + rarity + ", text=" + text + ", number=" + number + ", power=" + power + ", toughness=" + toughness + ", loyalty=" + loyalty + ", multiverseid=" + multiverseid + ", setList=" + Arrays.toString(setList) + '}';
    }
}
