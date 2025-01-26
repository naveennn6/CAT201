import React from 'react';
import './footer.css';

const Footer = () => {
  return (
    <footer>
      <section>
        <div id="containerFooter">
          {/* Contact Info */}
          <div id="webFooter">
            <h3>Contact Info</h3>
            <p>Email: <a href="mailto:statioShop33@gmail.com">statioShop33@gmail.com</a></p>
            <p>Phone: <a href="tel:0197293828">019-729-3828</a></p>
          </div>

          {/* Follow Us */}
          <div id="webFooter">
            <h3>Follow Us</h3>
            <p><a href="https://www.facebook.com" target="_blank" rel="noopener noreferrer">Facebook</a></p>
            <p><a href="https://www.twitter.com" target="_blank" rel="noopener noreferrer">Twitter</a></p>
            <p><a href="https://www.instagram.com" target="_blank" rel="noopener noreferrer">Instagram</a></p>
            <p><a href="https://www.linkedin.com" target="_blank" rel="noopener noreferrer">LinkedIn</a></p>
          </div>

          {/* Newsletter Subscription */}
          <div id="webFooter">
            <h3>Stay Updated</h3>
            <p>Subscribe to our newsletter for the latest updates and promotions:</p>
            <form>
              <input
                type="email"
                placeholder="Enter your email"
                required
                style={{ padding: '5px', fontSize: '12px', marginBottom: '10px' }}
              />
              <button
                type="submit"
                style={{
                  padding: '5px 10px',
                  fontSize: '12px',
                  backgroundColor: 'white',
                  color: 'rgb(29, 29, 29)',
                  border: 'none',
                  cursor: 'pointer'
                }}
              >
                Subscribe
              </button>
            </form>
          </div>
        </div>

        {/* Footer Credit */}
        <div id="credit">
          <a href="https://linkedin.com/in/priyanka-sharma-b79401142">© STATIOSHOP</a>&nbsp;&nbsp;|&nbsp;&nbsp;
          <a href="https://www.edyoda.com/" target="_blank" rel="noopener noreferrer">STATIONERY WEBSITE</a>
        </div>
      </section>
    </footer>
  );
};

export default Footer;

