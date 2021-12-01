
public class Common {
	int x;
	int y;
	int gcf;
	int lcm;
Common(){}
Common(int x,int y){
	this.x=x;
	this.y=y;
}
void find2Number() {
	int small=0;
	int big=0;
	if(this.x<this.y) {
		small=this.x;
		big=this.y;
	} else {
		small=this.y;
		big=this.x;
	}
	for(int n=2; n<=small; n++) {
		if(small%n==0 && big%n==0) {
			this.gcf=n;
		}
	}
}

void showGCF(){   //  최대공약수
		System.out.println(this.gcf);
}


void showLCM(){  //  최소공배수
	this.lcm=(x*y)/this.gcf;
		System.out.println(this.lcm);     
}
}
