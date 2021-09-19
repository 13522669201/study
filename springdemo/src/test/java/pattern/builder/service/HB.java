package pattern.builder.service;

import pattern.builder.Item;
import pattern.builder.Pack;

//汉堡
public  abstract  class HB implements Item {
    @Override
    public String name() {
        return "汉堡";
    }

    @Override
    public Pack pack() {
        return new HZ();
    }

    @Override
    public float pice() {
        return 18.5f;
    }
}
