package com.zhenghou.zuoye;

public class Classes {
    private Unit unit;
    private String context;

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Classes(Unit unit) {
        if(unit==Unit.U1){
            context="第一单元打基础";
        } else if (unit==Unit.U2) {
            context="第二单元可以胜任Java开发";
        }else {
            context="第三单元可以胜任企业级Java开发";
        }
    }

    @Override
    public String toString() {
        return context;
    }
}
