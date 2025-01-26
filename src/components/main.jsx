import React from "react";
import Slider from "react-slick";
import "slick-carousel/slick/slick.css"; 
import "slick-carousel/slick/slick-theme.css"; 

const Home = () => {
  // Settings for the slider
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 1,
    slidesToScroll: 1,
    autoplay: true,
    autoplaySpeed: 2000,
  };

  return (
    <div className="hero border-1 pb-3">
      <div className="card bg-dark text-white border-0 mx-3">
        <Slider {...settings}>
          <div>
            <img
              className="card-img img-fluid"
              src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Statioshop.png/1200px-Statioshop.png?20250119111238"
              alt="StatioShop logo" // Added alt text
              height={500}
            />
          </div>
          <div>
            <img
              className="card-img img-fluid"
              src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/DiscountVouch.png/1200px-DiscountVouch.png?20250119111238"
              alt="Discount voucher promotion"
              height={500}
            />
          </div>
          <div>
            <img
              className="card-img img-fluid"
              src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/BundlePurchase.png/1200px-BundlePurchase.png?20250119111242"
              alt="Bundle purchase promotion" // Added alt text
              height={500}
            />
          </div>
          <div>
            <img
              className="card-img img-fluid"
              src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/ChineseNewYear.png/1200px-ChineseNewYear.png?20250119111238"
              alt="Chinese New Year celebration"
              height={500}
            />
          </div>
        </Slider>
      </div>
    </div>
  );
};

export default Home;



