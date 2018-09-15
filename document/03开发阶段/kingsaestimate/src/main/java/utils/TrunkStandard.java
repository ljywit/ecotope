package utils;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/9/13.
 */
public class TrunkStandard {

    private BigDecimal typeIUl;

    private Short typeIUlSoc;

    private BigDecimal typeILl;

    private Short typeILlSoc;

    private BigDecimal typeIiUl;

    private Short typeIiUlSoc;

    private BigDecimal typeIiLl;

    private Short typeIiLlSoc;

    private BigDecimal typeIiiUl;

    private Short typeIiiUlSoc;

    private BigDecimal typeIiiLl;

    private Short typeIiiLlSoc;

    private BigDecimal typeIvUl;

    private Short typeIvUlSoc;

    private BigDecimal typeIvLl;

    private Short typeIvLlSoc;

    private BigDecimal typeVUl;

    private Short typeVUlSoc;

    private BigDecimal typeVLl;

    private Short typeVLlSoc;

    TrunkStandard(double typeIUl, int typeIUlSoc, double typeILl, int typeILlSoc,
                  double typeIiUl, int typeIiUlSoc, double typeIiLl, int typeIiLlSoc,
                  double typeIiiUl, int typeIiiUlSoc, double typeIiiLl, int typeIiiLlSoc,
                  double typeIvUl, int typeIvUlSoc, double typeIvLl, int typeIvLlSoc,
                  double typeVUl, int typeVUlSoc, double typeVLl, int typeVLlSoc) {
        this.typeIUl = BigDecimal.valueOf(typeIUl);
        this.typeIUlSoc = (short) typeIUlSoc;
        this.typeILl = BigDecimal.valueOf(typeILl);
        this.typeILlSoc = (short) typeILlSoc;
        this.typeIiUl = BigDecimal.valueOf(typeIiUl);
        this.typeIiUlSoc = (short) typeIiUlSoc;
        this.typeIiLl = BigDecimal.valueOf(typeIiLl);
        this.typeIiLlSoc = (short) typeIiLlSoc;
        this.typeIiiUl = BigDecimal.valueOf(typeIiiUl);
        this.typeIiiUlSoc = (short) typeIiiUlSoc;
        this.typeIiiLl = BigDecimal.valueOf(typeIiiLl);
        this.typeIiiLlSoc = (short) typeIiiLlSoc;
        this.typeIvUl = BigDecimal.valueOf(typeIvUl);
        this.typeIvUlSoc = (short) typeIvUlSoc;
        this.typeIvLl = BigDecimal.valueOf(typeIvLl);
        this.typeIvLlSoc = (short) typeIvLlSoc;
        this.typeVUl = BigDecimal.valueOf(typeVUl);
        this.typeVUlSoc = (short) typeVUlSoc;
        this.typeVLl = BigDecimal.valueOf(typeVLl);
        this.typeVLlSoc = (short) typeVLlSoc;
    }

    public BigDecimal getTypeIUl() {
        return typeIUl;
    }

    public void setTypeIUl(BigDecimal typeIUl) {
        this.typeIUl = typeIUl;
    }

    public Short getTypeIUlSoc() {
        return typeIUlSoc;
    }

    public void setTypeIUlSoc(Short typeIUlSoc) {
        this.typeIUlSoc = typeIUlSoc;
    }

    public BigDecimal getTypeILl() {
        return typeILl;
    }

    public void setTypeILl(BigDecimal typeILl) {
        this.typeILl = typeILl;
    }

    public Short getTypeILlSoc() {
        return typeILlSoc;
    }

    public void setTypeILlSoc(Short typeILlSoc) {
        this.typeILlSoc = typeILlSoc;
    }

    public BigDecimal getTypeIiUl() {
        return typeIiUl;
    }

    public void setTypeIiUl(BigDecimal typeIiUl) {
        this.typeIiUl = typeIiUl;
    }

    public Short getTypeIiUlSoc() {
        return typeIiUlSoc;
    }

    public void setTypeIiUlSoc(Short typeIiUlSoc) {
        this.typeIiUlSoc = typeIiUlSoc;
    }

    public BigDecimal getTypeIiLl() {
        return typeIiLl;
    }

    public void setTypeIiLl(BigDecimal typeIiLl) {
        this.typeIiLl = typeIiLl;
    }

    public Short getTypeIiLlSoc() {
        return typeIiLlSoc;
    }

    public void setTypeIiLlSoc(Short typeIiLlSoc) {
        this.typeIiLlSoc = typeIiLlSoc;
    }

    public BigDecimal getTypeIiiUl() {
        return typeIiiUl;
    }

    public void setTypeIiiUl(BigDecimal typeIiiUl) {
        this.typeIiiUl = typeIiiUl;
    }

    public Short getTypeIiiUlSoc() {
        return typeIiiUlSoc;
    }

    public void setTypeIiiUlSoc(Short typeIiiUlSoc) {
        this.typeIiiUlSoc = typeIiiUlSoc;
    }

    public BigDecimal getTypeIiiLl() {
        return typeIiiLl;
    }

    public void setTypeIiiLl(BigDecimal typeIiiLl) {
        this.typeIiiLl = typeIiiLl;
    }

    public Short getTypeIiiLlSoc() {
        return typeIiiLlSoc;
    }

    public void setTypeIiiLlSoc(Short typeIiiLlSoc) {
        this.typeIiiLlSoc = typeIiiLlSoc;
    }

    public BigDecimal getTypeIvUl() {
        return typeIvUl;
    }

    public void setTypeIvUl(BigDecimal typeIvUl) {
        this.typeIvUl = typeIvUl;
    }

    public Short getTypeIvUlSoc() {
        return typeIvUlSoc;
    }

    public void setTypeIvUlSoc(Short typeIvUlSoc) {
        this.typeIvUlSoc = typeIvUlSoc;
    }

    public BigDecimal getTypeIvLl() {
        return typeIvLl;
    }

    public void setTypeIvLl(BigDecimal typeIvLl) {
        this.typeIvLl = typeIvLl;
    }

    public Short getTypeIvLlSoc() {
        return typeIvLlSoc;
    }

    public void setTypeIvLlSoc(Short typeIvLlSoc) {
        this.typeIvLlSoc = typeIvLlSoc;
    }

    public BigDecimal getTypeVUl() {
        return typeVUl;
    }

    public void setTypeVUl(BigDecimal typeVUl) {
        this.typeVUl = typeVUl;
    }

    public Short getTypeVUlSoc() {
        return typeVUlSoc;
    }

    public void setTypeVUlSoc(Short typeVUlSoc) {
        this.typeVUlSoc = typeVUlSoc;
    }

    public BigDecimal getTypeVLl() {
        return typeVLl;
    }

    public void setTypeVLl(BigDecimal typeVLl) {
        this.typeVLl = typeVLl;
    }

    public Short getTypeVLlSoc() {
        return typeVLlSoc;
    }

    public void setTypeVLlSoc(Short typeVLlSoc) {
        this.typeVLlSoc = typeVLlSoc;
    }
}
