package Container;
/**
 * 
 * @author steveduarte
 * This generic container class will accept any Type
 */
public class myContainer<E> {
    
    /**
     * @param: value Any type can be passed here but cannot be primitive
     */
    public E value;
    
    // set a new value
    public myContainer(E value){
        this.value = value;
    }
    
    // this method returns the value passed to myContainer
    public E getValue(){
        return value;
    }
}
