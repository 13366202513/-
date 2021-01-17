package test.learn.algorithm.LinkList;

public class SingleLinkList {
    HeroNode heroNode = new HeroNode(0,"","");
    //为链表添加元素（尾插法）
    public void addHero(HeroNode hero){
        HeroNode temp = heroNode;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = hero;
    }
    //为链表添加元素（按顺序）
    public void addHero2(HeroNode hero){
         int num = hero.no;
         HeroNode temp = heroNode;
         while(true){
             if(temp.no==num){
                 System.out.println(hero.name+"节点已存在，无法重复添加！");
                 break;
             }
             if(temp.next==null){
                 addHero(hero);
                 break;
             }
             if(temp.next.no>num){
                 hero.next =temp.next;
                 temp.next = hero;
                 break;
             }
             temp=temp.next;
         }
    }
    //显示链表
    public void showHero(){
        HeroNode temp =  heroNode.next;
        if(temp==null){
            System.out.println("链表为空！");
            return;
        }
        while(temp!=null){
            System.out.println(temp.toString());
            temp=temp.next;
        }

    }
    //格式化链表
    public void initLink(){
        heroNode.next = null;
    }
    //修改英雄信息
    public void updateHero(HeroNode hero){
        if(heroNode.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = heroNode.next;
        while(true){
            if(temp.no==hero.no){
                temp.name=hero.name;
                temp.nickname=hero.nickname;
                break;
            }
            if(temp.next==null){
                System.out.println("没有找到与之相匹配的英雄。");
                break;
            }
            temp=temp.next;
        }
    }
    //删除英雄信息
    public void deleteHero(int no){
        if(heroNode.next==null){
            System.out.println("链表为空");
                return;
        }
        HeroNode temp = heroNode;
        while(true){
            if(temp.next==null){
                System.out.println("未查询到该英雄信息，无法删除！");
                break;
            }
            if(temp.next.no==no){
                break;
            }
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }


    }
}
