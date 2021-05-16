

object Q3_19001101 {
  def main(args: Array[String]){
    var numOfCopies = 60;
    var p_book = 24.95;
    var discount_pBook = p_book * 0.6;
    var shippingCost :Double = 0;
    
    if(numOfCopies > 50){
      shippingCost = ((numOfCopies - 50)*0.75 + 3*50);
    }else{
      shippingCost = (numOfCopies * 3);
    }
    
    var wholesale_cost  = (discount_pBook*60 + shippingCost);
    
    println(f"Wholesale cost for $numOfCopies%d copies : $wholesale_cost%.3f");
    
  }
}