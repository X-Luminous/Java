#include<iostream>
#include<cstring>
using namespace std;
int n;
int NotCircle(int a[])
{
    int maxn=-1000,sum[10000];
    sum[0]=a[0];
    for(int i=1;i<n;i++)
    {
        if(a[i]<a[i]+sum[i-1])
        {
            sum[i]=a[i]+sum[i-1];
        }
        else
        {
            sum[i]=a[i];
        }
        if(maxn<sum[i])
            maxn=sum[i];
    }
    return maxn;
}

int findmin(int a[])
{
    int minx=10000000;
    int sum[10000],flag=0;
    sum[0]=a[0];
    for(int i=1;i<n;i++)
    {
        if(sum[i-1]<0)
            sum[i]=sum[i-1]+a[i];
        else
            sum[i]=a[i];
        if(minx>sum[i])
        {
            minx=sum[i];
            flag=i;
        }
    }
    return flag;
}

int Circle(int a[])
{
      int minid=findmin(a),j,sum=0;
      int key=(minid+1)%n;
      int maxn=a[key];
      for(j=key;(j%n)!=minid;j++)
      {
          if(sum>0)
            sum+=a[j%n];
        else
            sum=a[j%n];

          if(maxn<sum)
            maxn=sum;
      }
      return maxn;
}

int main()
{
    int a[100],i,j;
    cout<<"��������Ԫ�ظ���"<<endl;
    cin>>n;
    cout<<"���������Ԫ�ص�ֵ"<<endl;
    for(i=0;i<n;i++)
        cin>>a[i];
    int max1=NotCircle(a);
    int max2=Circle(a);
    int max3=max(max1,max2);
    cout<<"�������������������Ϊ:"<<max3<<endl;
    return 0;
}
