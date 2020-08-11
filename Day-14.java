public Difference(int[] a) {
            this.elements=a;
        }
	// Add your code here
    public void computeDifference(){
        int max =1;
        int min = 100;
        for(int num : elements){
            if(num<min)min=num;
            if(num>max) max=num;
    }
        this.maximumDifference = Math.abs(max-min);
    }