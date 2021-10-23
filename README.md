# UnitTesting
Homework for Unit Testing
# Bài toán: Tính chỉ số BMI và đưa ra kết luận
## Input:
* (float) weight: cân nặng (kg) (0 < weight <= 150)
* (float) height: chiều cao (m) (0 < height <= 2)
## Chương trình:
Tính BMI = weight / height^2
## Output:
* Nếu !(0 < weight <= 150) hoặc !(0 < height <= 2) thì trả về “Invalid input”
* Nếu BMI dưới 18.5 thì trả về “Thiếu cân”
* Nếu BMI từ 18.5 đến 22.9 thì trả về “Bình thường”
* Nếu BMI từ 23 đến 24.9 thì trả về “Thừa cân“
* Nếu BMI >= 25 thì trả về “Béo phì”
