package ��̬�滮;

public class ���� {
	
	/* 0-1����
    * @param val ��ֵ
    * @param weight ����
    * @param W ��������
    * @return ���Ž�
    */
   public static int knapsack(int[] val, int[] weight, int W) {
       int N = weight.length;   //��¼���е���Ʒ��
       int[][] V = new int[N + 1][W + 1];  //������������
       for (int col = 0; col <= W; col++) { //�У���������Ϊ0
           V[0][col] = 0;
       }
       for (int row = 0; row <= N; row++) {
           V[row][0] = 0;
       }
       for (int item = 1; item <= N; item++) {  //һ��һ�����ֵ
           for (int wt = 1; wt <= W; wt++) {  //һ��һ�����ֵ
               if (weight[item - 1] <= wt) {  //�����ǰ��Ʒ����С�ڵ��ڱ����еĵ�ǰ���� itemΪ1�ǣ�weight[0]�ǵ�һ����Ʒ������
                   //�Ƚϲ��������Ʒʱ������������ֵ��ǰһ�У��뵱ǰ��Ʒ�ļ�ֵ+�������ɵ�ʣ�������ļ�ֵ
                   V[item][wt] = Math.max(val[item-1] + V[item-1][wt - weight[item-1]],V[item-1][wt]);
               } else { //�����ǰ��Ʒ�������ڱ����еĵ�ǰ����
                   V[item][wt]=V[item-1][wt];  //ֱ��ʹ��ǰһ�е����Ž�
               }
           }
       }
       return V[N][W];

	}
   
   
   //0-1���� ������װ����
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weight = {3,5,2,6,4}; //��Ʒ����
		int[] val = {4,4,3,5,3}; //��Ʒ��ֵ
		int m = 12; //��������
		int n = val.length; //��Ʒ����
		
		int[] f = new int[m+1];
		for(int i=1;i<f.length;i++){ 	//��װ����f[0]=0,f[1...m]����ʼ��Ϊ����С
			f[i] = Integer.MIN_VALUE;
		}
		for(int i=0;i<n;i++){
			for(int j=f.length-1;j>=weight[i];j--){
				f[j] = Math.max(f[j], f[j-weight[i]]+val[i]);
			}
		}
		for(int i=0;i<f.length;i++){
			System.out.print(f[i]+" ");
		}
		System.out.println();
		System.out.println("����ֵΪ"+f[f.length-1]);
	}

   //��ȫ����
   public static void main1(String[] args){
	   int[] weight = {3,4,6,2,5};
	   int[] val = {6,8,7,5,9};
	   int maxw = 10;
	   int[] f = new int[maxw+1];
	   for(int i=0;i<f.length;i++){
		   f[i] = 0;
	   }
	   for(int i=0;i<val.length;i++){
		   for(int j=weight[i];j<f.length;j++){
			   f[j] = Math.max(f[j], f[j-weight[i]]+val[i]);
		   }
	   }
	   System.out.println(f[maxw]);
  }

}
