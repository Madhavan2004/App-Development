import React, { useState } from 'react';
import './FAQ.css';

const FAQItem = ({ question, answer }) => {
  const [isOpen, setIsOpen] = useState(false);

  const toggleAccordion = () => {
    setIsOpen(!isOpen);
  };

  return (
    <div>
      <div onClick={toggleAccordion} style={{ cursor: 'pointer', marginBottom: 10 }}>
        <strong>{question}</strong>
      </div>
      {isOpen && <div style={{ marginLeft: 20 }}>{answer}</div>}
    </div>
  );
};

const FAQ = () => {
  const faqData = [
    {
      question: 'What types of furniture do you offer?',
      answer: 'We offer a wide range of furniture including sofas, chairs, tables, beds, and more.'
    },
    {
      question: 'Do you provide delivery services?',
      answer: 'Yes, we provide delivery services for our furniture. Delivery charges may apply.'
    },
    {
      question: 'Can I return or exchange a purchased item?',
      answer: 'Yes, we accept returns and exchanges within 30 days of the purchase date. Please refer to our return policy for more details.'
    },
    // Add more FAQ items as needed
  ];

  return (
    <div>
      <h2>Frequently Asked Questions</h2>
      {faqData.map((item, index) => (
        <FAQItem key={index} question={item.question} answer={item.answer} />
      ))}
    </div>
  );
};

export default FAQ;
