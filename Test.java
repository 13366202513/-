package test.learn.algorithm.LinkList;

public class Test {
    public static void main(String[] args) {
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.addHero(new HeroNode(1,"宋江","及时雨"));
        singleLinkList.addHero(new HeroNode(3,"卢俊义","玉麒麟"));
        singleLinkList.addHero(new HeroNode(2,"吴用","智多星"));
        singleLinkList.showHero();
        System.out.println("----------------------------");
        System.out.println("格式化链表");
        singleLinkList.initLink();
        singleLinkList.addHero2(new HeroNode(1,"宋江","及时雨"));
        singleLinkList.addHero2(new HeroNode(3,"卢俊义","玉麒麟"));
        singleLinkList.addHero2(new HeroNode(2,"吴用","智多星"));
        singleLinkList.addHero2(new HeroNode(2,"吴用","智多星"));
        singleLinkList.showHero();
        System.out.println("-----------------------------");
        singleLinkList.updateHero(new HeroNode(2,"刘锋","智多星"));
        singleLinkList.showHero();
        System.out.println("-----------------------------");
        singleLinkList.deleteHero(1);
        singleLinkList.deleteHero(2);
        //singleLinkList.deleteHero(3);
        singleLinkList.showHero();
    }
}
