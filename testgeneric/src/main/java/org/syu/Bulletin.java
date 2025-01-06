package org.syu;

public interface Bulletin {
    public void insert(BulletinVO vo);

    public BulletinVO get(int no);

    public BulletinVO getList();

    public void delete(int no);
}
