//House Robber
public  class Test{
	public static void main(String[] args){

		int[] num={};

		System.out.printf("%d", rob(num));

	}
	public static int rob(int[] num){
		int i=0;

		if(num.length==0)
			return 0;

			int[] dp=new int[num.length+1];
			dp[0]=0;
			dp[1]=num[0];
			if(num.length==1)
				return num[0];

			for(i=2;i<=num.length;i++)
			dp[i]=Math.max((dp[i-2]+num[i-1]),dp[i-1]);
			return dp[num.length];

	}
}
