class BinarySearch{  
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);  
            }else{  
            return binarySearch(arr, mid+1, last, key);  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {100,200,300,400,500};  
        int key = 300;  
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element not found");  
        else  
            System.out.println("Element found at index: "+result);  
    }  
}  
