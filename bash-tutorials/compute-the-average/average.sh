read n
sum=0
for i in `seq $n`
do
    read a
    sum=`echo $a '+' $sum | bc -l`
done

printf "%.3f\n" `echo  $sum '/' $n | bc -l`
