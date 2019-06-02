fun main(args:Array<String>)
{
    var arr=arrayOf(2,3,4,5,1);
    print("Unsorted Array : ");
    for(i in arr)
        print("$i ");
    for(i in 0..arr.size-2)
    {
        for(j in 0..arr.size-i-2)
        {
            if(arr[j]>arr[j+1])
            {
                var temp:Int=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    println();
    print("Ascending : ");
    for(i in arr)
        print("$i ");
    for(i in 0..arr.size-2)
    {
        for(j in 0..arr.size-i-2)
        {
            if(arr[j]<arr[j+1])
            {
                var temp:Int=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    println();
    print("Descending : ");
    for(i in arr)
        print("$i ");
}