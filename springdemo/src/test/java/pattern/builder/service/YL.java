package pattern.builder.service;

import pattern.builder.Item;
import pattern.builder.Pack;

public abstract  class YL implements Item {
    @Override
    public String name() {
        return "饮料";
    }

    @Override
    public Pack pack() {
        return new PZ();
    }

    @Override
    public float pice() {
        return 4.5f;
    }
}
