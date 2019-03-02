# TA HW2 - Permutation (Recursion) - 40 Points

[![Grader Status](YOUR_GRADER_BADGEhttps://kntu-grader.herokuapp.com/minimal?repo=tahw2-permutation-starter&id=9725543
)](https://kntu-grader.herokuapp.com/minimal?repo=tahw2-permutation-starter&id=9725543)



# Assignment discription

<div dir="rtl" align="right">
یکی از موضوعات جذاب ریاضیات، مبحث جایگشت ها می باشد. حال بر ما محول شده است برنامه ای بنویسیم که جایگشت های غیر تکراری حروف پشت سر هم زبان انگلیسی را بنویسیم. یعنی به عنوان مثال: برای جایگشت های دو حرف b تا c می توان به :

bc, cb, bb, cc

اشاره کرد که از آنجایی که bb و cc تکراری دارند آنها را نیاز نداریم پس جواب :

bc, cb

مد نظر ماست فراموش نکنید که نیازمندی ما یک تابع بازگشتی است.
</div>

# Sample

```java
public class Permutation {
    public static String[] permutation;
    //public static int index = 0; if you need a counter
    public static void perm1(String s) { 
        //your code
    }
    public static void main(String[] args) {
        //your code and reading inputs
    }
}

```

<div dir="rtl" align="right">
    
# ورودی
ورودی از طریق کامند لاین و دو عدد بین 0 تا 52 می باشند. 
.لذا از اسکنر استفاده نکنید.
توجه کنید که ورودی کامند لاین همواره رشته بوده و اگر گفته ایم عدد هست یعنی باید آن را با استفاده از متد مربوطه پارس کنید



# خروجی
خروجی برنامه آرایه جایگشت های مورد نظر است. حتما جواب ها را وارد آرایه کنید. در صورتی که جوابی وجود ندارد و طول بازه داده شده 0 است آرایه را خالی بگذارید نه null.

</div>
    
```java
permutation = new String[0]; // not permutation = null 
```


# Example
## Input Example 1
```
0 2
```
اعداد 0 تا 26 نمایانگر حروف کوچک و بعد از آن نمایانگر حروف بزرگ می باشند.

## Output Example 1
```
[ab, ba]
```
ترتیب نداریم.
</div>
