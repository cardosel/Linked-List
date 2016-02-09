
public class LinkedListNode<T>
{
  protected T data;
  protected LinkedListNode<T> next;
  
  public LinkedListNode()
  {
    this.next = null;
  }
  
  public T getData()
  {
    return (T)this.data;
  }
  
  public void setData(T data)
  {
    this.data = data;
  }
  
  public LinkedListNode<T> getNext()
  {
    return this.next;
  }
  
  public void setNext(LinkedListNode<T> node)
  {
    this.next = node;
  }
  
  public String toString()
  {
    return this.data.toString();
  }
}
