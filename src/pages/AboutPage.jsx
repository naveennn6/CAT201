import React from 'react'
import { Footer, Navbar } from "../components";

const AboutPage = () => {
  return (
    <>
      <Navbar />
      <div className="container my-3 py-3">
        <h1 className="text-center">About Us</h1>
        <hr />
        <p className="lead text-center">
        Welcome to StatioShop, your one-stop destination for all your stationery needs! 
        At StatioShop, we are passionate about bringing creativity and productivity to life with 
        Founded with a vision to inspire learners, creators, and professionals alike, we offer everything
         from premium notebooks, pens, and art supplies to office essentials and unique gift items. Whether 
         you're a student gearing up for success, an artist chasing inspiration, or a professional aiming
          for excellence, StatioShop has something special for you.Our carefully curated range of high-quality stationery products.
          Our mission is to combine functionality with style, making everyday tasks delightful and efficient. With a commitment to 
          exceptional customer service and affordable pricing, we strive to be more than just a store — we want to be a part of your journey.
          Thank you for choosing StatioShop. 
          Let's create, learn, and achieve together!

        </p>

        


        <h2 className="text-center py-4">Our Products</h2>
        <div className="row">
          <div className="col-md-3 col-sm-6 mb-3 px-3">
            <div className="card h-100">
              <img className="card-img-top img-fluid" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdT_IzLgDHlfG3DVnjHIX7uAG_qOVi6aioyQ&s" alt="" height={160} />
              <div className="card-body">
                <h5 className="card-title text-center">Office Supplies</h5>
              </div>
            </div>
          </div>
          <div className="col-md-3 col-sm-6 mb-3 px-3">
            <div className="card h-100">
              <img className="card-img-top img-fluid" src="https://media.istockphoto.com/id/185078634/photo/fountain-pen.jpg?s=612x612&w=0&k=20&c=BQQChM6wiZilZbdq4lx91_UCO58_S0MnP2ytLBcJCaQ=" alt="" height={160} />
              <div className="card-body">
                <h5 className="card-title text-center">Writing Instruments</h5>
              </div>
            </div>
          </div>
          <div className="col-md-3 col-sm-6 mb-3 px-3">
            <div className="card h-100">
              <img className="card-img-top img-fluid" src="https://images.pexels.com/photos/1927259/pexels-photo-1927259.jpeg?auto=compress&cs=tinysrgb&w=600" alt="" height={160} />
              <div className="card-body">
                <h5 className="card-title text-center">Paper products</h5>
              </div>
            </div>
          </div>
          <div className="col-md-3 col-sm-6 mb-3 px-3">
            <div className="card h-100">
              <img className="card-img-top img-fluid" src="https://images.pexels.com/photos/356056/pexels-photo-356056.jpeg?auto=compress&cs=tinysrgb&w=600" alt="" height={160} />
              <div className="card-body">
                <h5 className="card-title text-center">Art&Craft Supplies</h5>
              </div>
            </div>
          </div>
        </div>
      </div>
      <Footer />
    </>
  )
}

export default AboutPage