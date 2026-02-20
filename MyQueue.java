class MyQueue 
{
  int[] que;
  int capacity;
  int front,rear;
  MyQueue(int capacity)
	{
	  this.capacity=capacity;
	  que=new int[capacity];
	  front=rear=-1;
	}
}
