class Calculator{
	public int power(int n,int p) throws IOException{
		//if integers are negative gives Exception
		if(n<0||p<0) throw new IOException("n and p should be non-negative");
		//returns p times n
				return (int)Math.pow(n, p);
	}
	
}