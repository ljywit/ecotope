package utils;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/9/14.
 */
public class DrainStandard {
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

    DrainStandard(double typeIUl, int typeIUlSoc, double typeILl, int typeILlSoc,
                  double typeIiUl, int typeIiUlSoc, double typeIiLl, int typeIiLlSoc,
                  double typeIiiUl, int typeIiiUlSoc, double typeIiiLl, int typeIiiLlSoc) {
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
}
