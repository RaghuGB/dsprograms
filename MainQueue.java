class MainQueue
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		MyQueue mq=new MyQueue(5);
		mq.enQue(34);
		mq.enQue(86);
		mq.enQue(98);
		System.out.println(mq);//[34 86 98]
		
		System.out.println(mq.deQue());//34
		System.out.println(mq.deQue());//86
		System.out.println(mq.deQue());//98
		System.out.println("Main Method End");
	}
}