  /// Code for finding the correlation coefficient between two features. \\\
  
  
  
  public class Nb1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, Exception {
        float b[][]=new float[42][42];
        float r[][]=new float[42][42];
        float c[]=new float[42];
        float l;
		
		BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Pavilion\\Desktop\\corrected12.txt"));
         PrintWriter pr=new PrintWriter("C:\\Users\\Pavilion\\Desktop\\tert.txt");
        String line;
          int t=0;
          float a[]= new float[42];
	 while ((line = br.readLine()) != null)
            {
                
            t++;
             String[] tokens;
            tokens = line.split(",");
            for(int i=0;i<42;i++)
                 a[i]=a[i]+ Float.parseFloat(tokens[i]);
            }
         for(int i=0;i<42;i++)
                 a[i]=a[i]/t;
          // System.out.println(a[24]);
          BufferedReader br1= new BufferedReader(new FileReader("C:\\Users\\Pavilion\\Desktop\\corrected12.txt"));
         while ((line = br1.readLine()) != null)
            {
           // System.out.println(line);
             String[] tokens;
            tokens = line.split(",");
            for(int i=0;i<42;i++)
            {
                 float v= Float.parseFloat(tokens[i])-a[i];
                 //System.out.print(Math.round(-2.5));
                 //double u= Math.round(v*100.0)/100.0;
                 pr.write( (Float.toString(v))+",");
                
            }
            pr.write("\n");
            }
     
      pr.close();
      BufferedReader br2= new BufferedReader(new FileReader("C:\\Users\\Pavilion\\Desktop\\tert.txt"));
       while ((line = br2.readLine()) != null)
           
            {
           
           
             String[] tokens;
            tokens = line.split(",");
            for(int i=0;i<42;i++)
            {
                c[i]=c[i]+Float.parseFloat(tokens[i])*Float.parseFloat(tokens[i]);
                for(int j=i+1;j<42;j++)
                    b[i][j]=b[i][j]+Float.parseFloat(tokens[i])*Float.parseFloat(tokens[j]);
            }
            }
           for(int k=0;k<42;k++)
     {
       for(int j=k+1;j<42;j++)
       // System.out.print(b[k][j] + ",");
       System.out.println();
       
     } 
      for(int k=0;k<42;k++)
     {
       for(int j=k+1;j<42;j++)
       {
             l =(float)sqrt(c[k]*c[j]);
            r[k][j]=b[k][j]/l;
       }
       
     } 
      for(int k=0;k<42;k++)
     {
       for(int j=k+1;j<42;j++)
        System.out.print(r[k][j] + ",");
       System.out.println();
       
     } 
    
      for(int k=0;k<42;k++)
     {
       for(int j=k+1;j<42;j++)
       {
           if(r[k][j]>0.5)
        System.out.print(  k + " " + j +"the value of r[k][j]"+ " "+ r[k][j] + ",");
           if(Double.isNaN(r[k][j]))
               System.out.print(  k + " " + j +"the value of r[k][j]"+ " "+ r[k][j] + ",");
       }
       System.out.println();
       }
     }
     } 
	 
	 
	 /// Code for conversion the features value in the range of 0 to one.  \\\\
	 
	 
	 class Hello{
 static float d[]= new float[41];
 static float c[]=new float[41];
static String[] tokens;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, Exception {
        /*
		
		 String line;
        PrintWriter pr=new PrintWriter("C:\\Users\\Pavilion\\Desktop\\ch1.txt");
         BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pavilion\\Desktop\\hhl.txt"));
        while ((line = br.readLine()) != null)
              {
                  float a=0;int j;
            
            tokens = line.split(",");
            for(int i=0;i<26;i++)
            {
                a=Float.parseFloat(tokens[i]);
                  
                 if(a>d[i])
                           d[i]=a;
                  if(a<c[i])
                           c[i]=a;
                }
              }
    
     //for(int i=0;i<26;i++)
     //System.out.println(d[i]+ " " +c[i]);
                 BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Pavilion\\Desktop\\hhl.txt"));

      while ((line = br1.readLine()) != null)
      {
          tokens = line.split(",");
      for( int i=0;i<26;i++)
            {
                { 
             float a=Float.parseFloat(tokens[i]);
             
             float k=((a-c[i])/(d[i]-c[i]));
             String g=Float.toString(k);
             //System.out.println(k);
             pr.write(k+",");
                }
             
            }pr.append(tokens[26]);
            pr.write("\n");
      }    
      pr.close();
}  
        
    
	
	
	