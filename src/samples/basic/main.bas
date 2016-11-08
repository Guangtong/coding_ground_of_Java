#cbas#run_only
100 sam=1
150 factr=.6
200 if sam > 6 then goto 600
300 print sam, sam^factr+3
400 sam=sam+1
500 goto 150
600 end
