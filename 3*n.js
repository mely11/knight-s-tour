public Cal3(m)
   tour7 = ((1, 3), (2, 1), (4, 2),(6, 1), (7, 3), (5, 2), (7, 1), (6, 3), (5, 1), (7, 2), (5, 3), (1, 1), (2, 3), (3, 1) ,
       (2, 3), (1, 2), (3, 3), (4, 1), (6, 2), (4, 3), (2, 2));
   tour8 =((1, 3), (2, 1), (4, 2),(6, 1),(8, 2), (6, 3), (5, 1), (7, 2), (5, 3), (1, 1), (2, 3), (3, 1), (1, 2), (3, 3), (4, 1), (2, 2),
        (4, 3), (8, 1), (7, 3), (5, 2), (7, 1), (8, 3));
   tour9 = ((1, 3), (2, 1), (4, 2),(6, 1),(8, 2), (6, 3), (5, 1), (7, 2), (9, 1), (8, 3), (7, 1), (9, 2), (7, 3), (5, 2), (3, 3), (1, 2),
       (3, 1), (2, 3), (1, 1), (5, 3), (4, 1), (2, 2), (4, 3), (8, 1), (9, 3));
   tour10 = ((1, 3), (2, 1), (4, 2),(6, 1),(8, 2), (10, 1), (9, 3), (8, 1), (10, 2), (8, 3), (4, 1),(2, 2), (4, 3), (5, 1), (6, 3), (7, 1),
       (9, 2), (7, 3), (5, 2), (3, 3), (1, 2), (3, 1), (2, 3), (1, 1), (5, 3), (9, 1), (10, 3));
   k = (m - 7) % 4 + 7;
   j = (m - k)/4;
   if (k = 7){
       print (tour7);
       for (int i = 0; i < j; i++){
           l = 4 * i;
           print((l + 8, 3), (l + 10, 2), (l + 8, 1), (l + 9, 3), (l + 11, 2), (l + 9, 1), (l + 10, 3), (l + 8, 2), (l + 10, 1),
               (l + 11, 3), (l + 9, 2), (l + 11, 1));}
   }
   if (k = 8){
       print (tour8);
       for (int i = 0; i < j; i++){
           l = 4 * i;
           print((l + 9, 3), (l + 11, 2), (l + 9, 1), (l + 10, 3), (l + 12, 2), (l + 10, 1), (l + 11, 3), (l + 9, 2), (l + 11, 1),
               (l + 12, 3), (l + 10, 2), (l + 12, 1);}
   }
   if (k = 9){
       print (tour9);
       for (int i = 0; i < j; i++){
           l = 4 * i;
           print((l + 10, 3), (l + 12, 2), (l + 10, 1), (l + 11, 3), (l + 13, 2), (l + 11, 1), (l + 12, 3), (l + 10, 2), (l + 12, 1),
               (l + 13, 3), (l + 11, 2), (l + 13, 1);}
   }
   if (k = 10){
       print (tour10);
       for (int i = 0; i < j; i++){
           l = 4 * i;
           print((l + 11, 3), (l + 13, 2), (l + 11, 1), (l + 12, 3), (l + 14, 2), (l + 12, 1), (l + 13, 3), (l + 11, 2), (l + 13, 1),
               (l + 14, 3), (l + 12, 2), (l + 14, 1);}
   }






