public class BlueRayCollection {
    private BlueRayDisk head;
    public void addDisk(String title, String director, int yearOfRelease, double cost){
        BlueRayDisk blueRayDisk = new BlueRayDisk(title,director,yearOfRelease,cost);
        if(head == null){
            head = blueRayDisk;
        }else{
            BlueRayDisk current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = blueRayDisk;
        }
    }
    public String showAll(){
        if(head==null) return "BlueRay collection is empty";
        StringBuilder collection = new StringBuilder();
        BlueRayDisk current = head;
        while(current != null){
            collection.append(current.toString()).append("\n");
            current = current.next;
        }
        return collection.toString().trim();
    }
}