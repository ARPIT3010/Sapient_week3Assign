
public class Fig_to_words {
	

	public static String fig_to_words(long number) {

	String Words = "";

	String unitsArr[] = { " Zero", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
			" Eleven", " Twelve"," Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen"," Eighteen", " Nineteen" };

	String tensArr[] = { " Zero", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty",
			" Ninety" };

String val[]={" Crores"," Lakhs"," Thousands"," Hundreds"," Only"};
long  inVal[]={10000000,100000,1000,100,1};
for(int i = 0;i<inVal.length;i++)
{
	long b1=number/inVal[i];
	number%=inVal[i];
	if(b1>0)
	{
		if(b1>19){
		Words+=tensArr[(int)b1/10]+ unitsArr[(int)b1%10]+val[i];
	}
else
{
Words+= unitsArr[(int)b1]+val[i];
}
}
}
return Words;
}
}
