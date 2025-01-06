package org.syu;

public class MemberRepository implements Repository<Man> {

    private Man m = null;

    @Override
    public void save(Man item) {
        this.m = item;
    }

    @Override
    public Man findById(int id) {
        return new Man(3, 4);
    }
}
