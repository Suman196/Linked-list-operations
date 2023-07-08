class ll{
    Node head;
    private int size;
    //Node creation
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
            
        }
    }
    //addfirst
    public void addf(String data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head = newnode;
        
    }
    //addlast
    public void addl(String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return ;
        }
        Node lastnode = head;
        while(lastnode.next !=null){
            lastnode = lastnode.next;
        }
        lastnode.next=newnode;
        
    }
    public int getsize(){
        return size;
    }
    //delectfirst
    public void delf(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        head = this.head.next;
        size--;
    }
    //deletelast
    public void dellast(){
        Node seclastnode = head;//pointing seclastnode to head
        Node lastnode = head.next;//pointing lastnode to header next
        if(head==null){
            System.out.println("Nothing to delete , empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        while(lastnode.next !=null){
            lastnode = lastnode.next;
            seclastnode = seclastnode.next;
        }
        seclastnode.next=null;
        size--;
    }
    //print list
    public void prt(){
        Node currnode = head;
        while(currnode!=null){
            System.out.print(currnode.data+" -> ");
            currnode = currnode.next;
        }
        System.out.println("Null");
        }
    
    public static void main(String args[]){
        ll ob = new ll();
        ob.addf("good");
        ob.addf("not");
        ob.addf("am");
        ob.addl("I");
        ob.getsize();
        ob.delf();
        System.out.println(ob.getsize());
        ob.dellast();
        System.out.println(ob.getsize());
        ob.prt();
    }
}
