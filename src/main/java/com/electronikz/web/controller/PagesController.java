package com.electronikz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PagesController {

    @RequestMapping("/contact-us")
    public String contactPage(Model model){
        String contact = "<p><span style=\"font-size: 12pt;\">Electronikz.com&nbsp;is a free online magazine for Electronics, Digital Devices&nbsp;and Other Items.</span><br>\n" +
                "<span style=\"font-size: 12pt;\">&nbsp;&nbsp;</span><br>\n" +
                "<span style=\"font-size: 12pt;\">Many items listed on this site do return a small commission for product referral, however this is not the sole motivation for featuring an item. Our staff regularly lists products that we receive absolutely no compensation for. We do not carry any of the products listed on the site, nor do we directly sell anything.</span><br>\n" +
                "<span style=\"font-size: 12pt;\">&nbsp;&nbsp;</span><br>\n" +
                "<span style=\"font-size: 12pt;\">Please remember that we are not an actual webstore. We do not sell anything ourselves, and we do not ship anything ourselves. We cannot assist you with your purchase orders, and we do not know if a product can be shipped internationally.</span><br>\n" +
                "<span style=\"font-size: 14pt;\">&nbsp;&nbsp;</span></p>\n" +

                "<p>Electronikz.com&nbsp;© 2017<br>\n" +
                "21 The Moorings,<br>\n" +
                "Prince Regent Lane,<br>\n" +
                "London, E16 3JN,<br>\n" +
                "United Kingdom";

        model.addAttribute("text", contact);
        model.addAttribute("title","Contact Us");

        return "page";
    }

    @RequestMapping("/privacy-policy")
    public String privacyPolicy(Model model) {
        String policy = "<p style=\"text-align: center;\"><strong><br>\n" +
                "Privacy Policy</strong></p>\n" +
                "<p style=\"text-align: center;\">Electronikz.com</p>\n" +
                "<ol>\n" +
                "<li><strong><br>\n" +
                "Scope</strong></li>\n" +
                "</ol>\n" +
                "<p>Electronikz.com (“Electronikz.com”), owns and operates the web site www.Electronikz.com (the “Site”) and is the sole owner of the information collected on<br>\n" +
                "the Site.</p>\n" +
                "<p>This Privacy Policy covers how we handle your personally identifiable information (“Personal Data”) on the Site. Electronikz.com knows that users care about<br>\n" +
                "how their personal information is used and shared, and we take your privacy seriously. Please read the following to learn more about our privacy policy.</p>\n" +
                "<p>By voluntarily providing us with Personal Data, you are consenting to our use of it in accordance with this Privacy Policy. If you provide Personal Data to<br>\n" +
                "the Site, you acknowledge and agree that such Personal Data may be transferred from your current location to the offices and servers of Electronikz.com and<br>\n" +
                "the authorized third parties referred to herein.<br>\n" +
                "<strong><br>\n" +
                "2. Information collected through the Site.</strong></p>\n" +
                "<p>If you choose to use extended features of our Site, you must first complete the registration form and create a username and password. During registration<br>\n" +
                "and use of the Site, you are required to give contact information and other Personal Data. Such types of information, and the points at which they are<br>\n" +
                "collected, include:</p>\n" +
                "<ol>\n" +
                "<li>Personal Data</li>\n" +
                "</ol>\n" +
                "<p>[1] Registered Users. For Users wishing to make use of extended features of our Site, registration may be required where we you to give us some Personal<br>\n" +
                "Data which may include your name and email address. Such registration information is used to provide access to the Site and contact you when necessary.</p>\n" +
                "<p>[2] Non-Registered Users. While no Personal Data may be requested of Users wishing to make use of our Site without registering, other data may be collected<br>\n" +
                "in association with use of our Site. This information is described below.</p>\n" +
                "<ol>\n" +
                "<li>Other Information</li>\n" +
                "</ol>\n" +
                "<p>[1] Log Files. As is true of most websites, we gather certain information automatically and store it in log files. This information includes internet<br>\n" +
                "protocol (“IP”) addresses, browser type, internet service provider (“ISP”), referring/exit pages, operating system, date/time stamp, and clickstream data.<br>\n" +
                "We use this information, which does not identify individual users, to analyze trends, to administer the site, to track users’ movements around the site and<br>\n" +
                "to gather demographic information about our user base as a whole. Although we do not routinely associate this data with records containing Personal Data,<br>\n" +
                "we will use IP addresses to identify any user who refuses to comply with our Terms of Use and to identify users who threaten our service, Site, or other<br>\n" +
                "users.</p>\n" +
                "<p>[2] Cookies. A cookie is a small text file that is stored on a user’s computer for record-keeping purposes. We use cookies on this site and do not link<br>\n" +
                "this information stored in cookies to personally identifiable information you submit while on our site. We may use both session ID cookies and/or<br>\n" +
                "persistent cookies as part of the Site’s functionality. A session ID cookie expires when you close your browser and allows the Site to display your current<br>\n" +
                "session. A persistent cookie remains on your hard drive for an extended period of time and may be used to store your username or other identifier used by<br>\n" +
                "the Site. You can remove persistent cookies by following directions provided in your Internet browser’s “help” file.</p>\n" +
                "<p>Most browsers have an option for turning off the cookie feature, which will prevent your browser from accepting new cookies, as well as allowing you to<br>\n" +
                "decide on acceptance of each new cookie in a variety of ways. We strongly recommend that you leave the cookies activated in order to ensure the proper<br>\n" +
                "functionality of the Site.</p>\n" +
                "<ol start=\"3\">\n" +
                "<li><strong> Our Use of Your Personal Data and Other Information</strong></li>\n" +
                "</ol>\n" +
                "<p>We use the Personal Data you provide in a manner that is consistent with this Privacy Policy. If you provide Personal Data for a certain reason, we may use<br>\n" +
                "the Personal Data in connection with the reason for which it was provided. For instance, registration information submitted when creating your account, may<br>\n" +
                "be used to help suggest products to you based on past purchases. Also, we may use your Personal Data to provide access to services on the Site and monitor<br>\n" +
                "your use of such services. Electronikz.com may also use your Personal Data and other personally non-identifiable information collected through the Site to<br>\n" +
                "help us improve the content and functionality of the Site, to better understand our users, and to improve our services.</p>\n" +
                "<ol start=\"4\">\n" +
                "<li><strong> Our Disclosure of your Personal Data and Other Information</strong></li>\n" +
                "<li>Electronikz.com is not in the business of selling your Personal Data. We consider this information to be a vital part of our relationship with you and<br>\n" +
                "will not disclose your Personal Data to a third party except as set forth in this Privacy Policy. There are, however, certain circumstances in which we may<br>\n" +
                "share your Personal Data with certain third parties without further notice to you, as set forth below:</li>\n" +
                "</ol>\n" +
                "<p>[1] Business Transfers. As we develop our business, we might sell or buy businesses or assets. In the event of a corporate sale, merger, reorganization,<br>\n" +
                "dissolution or similar event, Personal Data may be part of the transferred assets.</p>\n" +
                "<p>[2] Related Companies. We may also share your Personal Data with Electronikz.com related companies for the same purpose as the use by Electronikz.com itself.<br>\n" +
                "Namely, such Personal Data may be used by the Electronikz.com related companies to improve the content and functionality of the Site, to better understand<br>\n" +
                "our users, and to improve or deliver our services.</p>\n" +
                "<p>[3] Agents, Consultants, and Related Third Parties. Electronikz.com, like many businesses, sometimes hires other companies to perform certain<br>\n" +
                "business-related functions. We may use third party companies to provide mailing services, database maintenance, payment processing, and identity<br>\n" +
                "verification. When you register for the Site, we will only share your Personal Data, such as your email, necessary for the third party to provide such<br>\n" +
                "services. Those third parties are prohibited from using your personally identifiable information for any other purpose.</p>\n" +
                "<p>Other than the agents, consultants and related third parties described above, Electronikz.com will not share, rent or trade Personal Data with any third<br>\n" +
                "parties for their promotional purposes.</p>\n" +
                "<p>[4] Legal Requirements. We reserve the right to disclose your Personal data as required by law and when we believe that disclosure is necessary to protect<br>\n" +
                "our rights and/or comply with a judicial proceeding, court order, or legal process served on us or our Site.</p>\n" +
                "<p>Electronikz.com may also disclose your Personal Data in the good faith belief that such action is necessary to (i) protect and defend the rights or property<br>\n" +
                "of Electronikz.com, (ii) act in urgent circumstances to protect the personal safety of users of the Site or the public, or (iii) protect against legal<br>\n" +
                "liability.</p>\n" +
                "<p>[5] Consent. Except as set forth above, you will be notified when your personal Data may be shared with third parties, and will be able to prevent the<br>\n" +
                "sharing of this information.</p>\n" +
                "<p>If your Personal Data changes, or if you no longer desire our service, you may correct, update, delete or deactivate it by making the change on the Site.<br>\n" +
                "Alternatively, you may email our Customer Support staff or contact us by telephone or regular mail at the contact information listed below.<br>\n" +
                "<strong><br>\n" +
                "5. External Links</strong></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>Our Site may provide links to various third party websites. However, even if a third-party affiliation exists between our site and that destination site,<br>\n" +
                "we do not exercise authority over these linked sites, each of which maintains independent privacy and data collection policies and procedures. We do not<br>\n" +
                "assume responsibility or liability and are not responsible for the independent policies and procedures of destination sites. Similarly, we cannot take<br>\n" +
                "responsibility for the privacy initiatives or the content of such websites. However, we wish to ensure the integrity of our site and any destination links,<br>\n" +
                "so any comments pertaining to any website accessed through these links are greatly appreciated.<br>\n" +
                "<strong><br>\n" +
                "6. Exclusions</strong></p>\n" +
                "<p>This Privacy Policy does not apply to any information collected by Electronikz.com other than Personal Data collected through the Site. This Privacy Policy<br>\n" +
                "shall not apply to any unsolicited information you provide to Electronikz.com through the Site or through any other means. This includes, but is not limited<br>\n" +
                "to, information posted to any public area of the Site, including the comments, forum, and review sections of the Site (collectively, “Public Areas”).<br>\n" +
                "Please think carefully before disclosing Personal Data in a Public Area. All such information is not confidential and Electronikz.com shall be free to<br>\n" +
                "reproduce, use, disclose, and distribute such information to others without limitation or attribution and it may be used by others in ways we cannot<br>\n" +
                "prevent.<br>\n" +
                "<strong><br>\n" +
                "7. Children</strong></p>\n" +
                "<p>Electronikz.com respects the sensitive nature of children’s privacy online. We do not direct any of our content or services, not do we knowingly collect<br>\n" +
                "Personal Data from children under the age of 13. If you are under thirteen, please do not submit any Personal Data through the Site. If you have reason to<br>\n" +
                "believe that a child under the age of 13 has provided Personal Data to Electronikz.com through the Site, please contact us and we will endeavor to delete<br>\n" +
                "that information from our databases.</p>\n" +
                "<ol start=\"8\">\n" +
                "<li><strong> Security</strong></li>\n" +
                "</ol>\n" +
                "<p>We employ reasonable security measures to protect against the loss, misuse, and alteration of the personal Data under our control. Personal Data is stored<br>\n" +
                "in a secured database and always sent via an encrypted SSL protocol when supported by your browser. However, no Internet or email transmission is ever<br>\n" +
                "fully secure or error free. In particular, email sent to or from the Site may not be secure. Therefore, you should take special care in deciding what<br>\n" +
                "information you send to us via email.<br>\n" +
                "<strong><br>\n" +
                "9. Opt-Out</strong></p>\n" +
                "<p>We provide you the opportunity to “opt-out” of having your personally identifiable information used for certain purposes, when we ask you for this<br>\n" +
                "information. For example, when you register for the Site, if you do not wish to receive any additional material or notifications from us, you can indicate<br>\n" +
                "your preference on our registration form.</p>\n" +
                "<ol start=\"10\">\n" +
                "<li><strong><br>\n" +
                "Framing</strong></li>\n" +
                "</ol>\n" +
                "<p>At times, the Site may make use of “framing” technology, during which a frame within the window of the Site is actually displaying the content of another<br>\n" +
                "website not owned or operated by Electronikz.com. You should read the privacy policy of such other website as it will govern the information that is<br>\n" +
                "collected there.<br>\n" +
                "<strong><br>\n" +
                "11. Other Terms and Conditions</strong></p>\n" +
                "<p>Your access to and use of the Site is subject to the Terms of Use. The Site is intended for United States users and United States law governs all<br>\n" +
                "transactions conducted on the Site and any use of materials found on the Site.</p>\n" +
                "<ol start=\"12\">\n" +
                "<li><strong><br>\n" +
                "Contacting Us:</strong></li>\n" +
                "</ol>\n" +
                "<p>If you have any questions about this Privacy Policy, the practices of the Site, or your interaction with the Site, please contact us by clicking on the<br>\n" +
                "“Contact Us” link at the bottom of the page or at the following address:</p>\n" +
                "<p>Electronikz.com<br>\n" +
                "27 The Moorings,</p>\n" +
                "<p>Prince Regent Lane</p>\n" +
                "<p>London, E163JN</p>\n" +
                "<ol start=\"13\">\n" +
                "<li><strong><br>\n" +
                "Changes to this Privacy Policy</strong><br>\n" +
                "Electronikz.com reserves the right to modify this Privacy Policy from time to time, so please review it frequently. If we make material changes in the way we<br>\n" +
                "use Personal Data, we will notify you here, by email, or by posting an announcement on the home page of our Site. Your continued use of the Site after such<br>\n" +
                "changes are posted will indicate your acceptance of the changed terms.</li>\n" +
                "</ol>\n" +
                "<p><strong><br>\n" +
                "Terms Of Use</strong></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>Electronikz.com</p>\n" +
                "<p>TERMS OF USE</p>\n" +
                "<p>Electronikz.com (“ELECTRONIKZ.COM”) provides users the ability to discover and purchase unique products through our website. Those services are provided<br>\n" +
                "subject to the following terms and conditions.</p>\n" +
                "<ol>\n" +
                "<li><strong><br>\n" +
                "PRIVACY</strong></li>\n" +
                "</ol>\n" +
                "<p>Please review our Privacy Notice to understand our privacy practices.</p>\n" +
                "<ol start=\"2\">\n" +
                "<li><strong><br>\n" +
                "GENERAL</strong></li>\n" +
                "</ol>\n" +
                "<p>This page states the Terms of Use (“Terms”) under which you may use www.Electronikz.com (the “Site”), an on-line service to discover and purchase new and<br>\n" +
                "unique products and gifts.<br>\n" +
                "These Terms include the ELECTRONIKZ.COM Privacy Policy which is incorporated into these Terms by reference. Please read these Terms carefully. If You do not<br>\n" +
                "accept the Terms stated here, do not use the Site and its services. By registering for and using the Site, You expressly agree to be bound by these Terms,<br>\n" +
                "including the ELECTRONIKZ.COM Privacy Policy.</p>\n" +
                "<p>ELECTRONIKZ.COM may revise these Terms at any time by posting an updated version to the Site. You should visit this page periodically to review the most<br>\n" +
                "current Terms because they are binding on You. The terms “You” and “User” as used herein refer to all individuals and/or entities accessing the Site for<br>\n" +
                "any reason. The term “Post” as used herein shall mean information that You submit, publish, or display on the Site.</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<ol start=\"3\">\n" +
                "<li><strong> ELIGIBILITY</strong></li>\n" +
                "</ol>\n" +
                "<p>By visiting the Site and accepting these Terms, You represent and warrant to ELECTRONIKZ.COM that You have the right, authority and capacity to agree to and<br>\n" +
                "abide by these Terms. You also represent and warrant to ELECTRONIKZ.COM that You will use the Site in a manner consistent with any and all applicable laws<br>\n" +
                "and regulations.</p>\n" +
                "<ol start=\"4\">\n" +
                "<li><strong><br>\n" +
                "LICENSE</strong></li>\n" +
                "</ol>\n" +
                "<p>ELECTRONIKZ.COM grants you a non-exclusive, non-transferable, limited license to access and make personal use of the Site and not to download (other than<br>\n" +
                "page caching) or modify it, or any portion of it, except with the express written consent of ELECTRONIKZ.COM. This license allows people searching for unique<br>\n" +
                "products and gifts to purchase those products for personal use. Users are further prohibited from making any derivative use of the Site or its Content;<br>\n" +
                "downloading or copying any account information or listing information for the benefit of any third party; or using any “robots,” “spiders,” or similar<br>\n" +
                "data-gathering, data-mining, or data extraction tools. All content on the Site is the property of ELECTRONIKZ.COM, and no portion of the Site may be<br>\n" +
                "reproduced, duplicated, copied, sold, resold, visited, or otherwise exploited for any commercial purpose without the express written consent of MATURE<br>\n" +
                "COLORS.</p>\n" +
                "<p>Any unauthorized use terminates the permission or license granted by ELECTRONIKZ.COM and may result in both civil and criminal liability.</p>\n" +
                "<ol start=\"5\">\n" +
                "<li><strong><br>\n" +
                "SITE RESTRICTIONS</strong></li>\n" +
                "</ol>\n" +
                "<p>Users may not use the Site in order to transmit, post, distribute, store or destroy material, including, without limitation, comments and reviews (the<br>\n" +
                "“Content”) (i) in violation of any applicable law or regulation, (ii) in a manner that will infringe the copyright, trademark, trade secret or other<br>\n" +
                "intellectual property rights of others or violate the privacy, publicity or other personal rights of others, or (iii) that is defamatory, obscene,<br>\n" +
                "threatening, abusive or hateful.</p>\n" +
                "<p>Users are also prohibited from violating or attempting to violate the security of the Site, including, without limitation, the following activities: (i)<br>\n" +
                "accessing data not intended for such User or logging into a server or account which the User is not authorized to access; (ii) attempting to probe, scan,<br>\n" +
                "or test the vulnerability of a system or network or to breach security or authentication measures without proper authorization; (iii) attempting to<br>\n" +
                "interfere with service to any User, host or network, including, without limitation, via means of submitting a virus to the Site, overloading, “flooding”,<br>\n" +
                "“spamming”, “mailbombing”, or “crashing”; or (iv) forgoing any TCP/IP packet header or any part of the header information in any email or posting on the<br>\n" +
                "Site. Attempts to violate system or network security immediately terminate the permission or license granted by ELECTRONIKZ.COM and may result in civil<br>\n" +
                "and/or criminal liability.</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<ol start=\"6\">\n" +
                "<li><strong> PROHIBITED USES</strong></li>\n" +
                "</ol>\n" +
                "<p>Listing of available products on the Site may be used only for lawful purposes by Users of the Site. You may not frame or utilize framing techniques to<br>\n" +
                "enclose any trademark, logo, copyrighted image, or other proprietary information (including images, text, page layout, or form) of ELECTRONIKZ.COM without<br>\n" +
                "express written consent. You may not use any meta tags or any other “hidden text” utilizing ELECTRONIKZ.COM’s name or trademarks without the express written<br>\n" +
                "consent of ELECTRONIKZ.COM. You agree not to sell or modify any content found on the Site including, but not limited to, names of Users and Content, or to<br>\n" +
                "reproduce, display, publicly perform, distribute, or otherwise use the Content, in any way for any public purpose, in connection with products or services<br>\n" +
                "that are not those of ELECTRONIKZ.COM, in any other manner that is likely to cause confusion among consumers, that disparages or discredits ELECTRONIKZ.COM or<br>\n" +
                "its licensors, that dilutes the strength of ELECTRONIKZ.COM’s or its licensor’s property, or that otherwise infringes ELECTRONIKZ.COM’s or its licensor’s<br>\n" +
                "intellectual property rights. You further agree to in no other way misuse the Content that appears on the Site. The use of the Content on any other website<br>\n" +
                "or in a networked computer environment for any purpose is prohibited. Any code that ELECTRONIKZ.COM creates to generate or display any Content of the pages<br>\n" +
                "making up the Site is also protected by ELECTRONIKZ.COM’s copyright, and you may not copy or adapt such code.</p>\n" +
                "<p>ELECTRONIKZ.COM has no duty to monitor any materials posted, transmitted, or communicated to or with the Site. If you believe that something on the Site<br>\n" +
                "violates these Terms please contact our designated agent as set forth below.</p>\n" +
                "<p>If notified by a User of any materials which allegedly do not conform to these Terms, ELECTRONIKZ.COM may in its sole discretion investigate the allegation<br>\n" +
                "and determine whether to take any other actions or remove or request the removal of the Content. ELECTRONIKZ.COM has no liability or responsibility to Users<br>\n" +
                "for performance or nonperformance of such activities.</p>\n" +
                "<ol start=\"7\">\n" +
                "<li><strong><br>\n" +
                "ELECTRONIC COMMUNICATION</strong></li>\n" +
                "</ol>\n" +
                "<p>When you visit the Site or send emails to us, you are communicating with us electronically. You consent to receive communications from us electronically.&nbsp;We will communicate with you by email or by posting notices on the Site. You agree that all agreements notices, disclosure, and other communicates that we&nbsp;provide to you electronically satisfy any legal requirements that such communications be in writing.</p>\n" +
                "<ol start=\"8\">\n" +
                "<li><strong><br>\n" +
                "COPYRIGHT</strong></li>\n" +
                "</ol>\n" +
                "<p>All content included on this Site, such as text, graphics, logos, icons, images, data compilations, and software, is the property of ELECTRONIKZ.COM or its&nbsp;content suppliers and protected by United States and international copyright laws. The compilation of all content on this Site is the exclusive property of&nbsp;ELECTRONIKZ.COM and protected by U.S. and international copyright laws. All software used on this Site is the property of ELECTRONIKZ.COM or its software&nbsp;suppliers and protected by U.S. and international copyright laws.</p>\n" +
                "<ol start=\"9\">\n" +
                "<li><strong> TRADEMARKS</strong></li>\n" +
                "</ol>\n" +
                "<p>TryAdultColoringBookss.com, ELECTRONIKZ.COM, and other ELECTRONIKZ.COM graphics, logos, page headers, icons, images, and service names are trademarks, registered&nbsp;trademarks, or trade dress of ELECTRONIKZ.COM in the U.S. and/or other countries. ELECTRONIKZ.COM’s trademarks and trade dress may not be used in connection&nbsp;with any product or service that is not ELECTRONIKZ.COM’s, in any manner that is likely to cause confusion among the public, or in any manner that disparages&nbsp;or discredits ELECTRONIKZ.COM. All other trademarks not owned by ELECTRONIKZ.COM that may appear on this Site are the property of their respective owners, who&nbsp;may or may not be affiliated with, connected to, or sponsored by ELECTRONIKZ.COM.</p>\n" +
                "<ol start=\"10\">\n" +
                "<li><strong><br>\n" +
                "YOUR ACCOUNT</strong></li>\n" +
                "</ol>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>If you use the Site, you are responsible for maintaining the confidentiality of your account and password and for restricting access to your computer, and&nbsp;you agree to accept responsibility for all activities that occur under your account and password. You also agree to not disclose any personally&nbsp;identifiable data, including, but not limited to, first and last names, credentials, or other information of a personal nature (“Personal Data”) obtained&nbsp;from the Site. Your disclosure of any Personal Data obtained from the Site may result in the immediate termination of your account. ELECTRONIKZ.COM further&nbsp;reserves the right to refuse service, terminate accounts, and remove or edit Content at its sole discretion.</p>\n" +
                "<p>ELECTRONIKZ.COM does not represent or guarantee the truthfulness, accuracy, or reliability of Content on the site, including Personal Data. Each User is&nbsp;responsible for updating and revising any relevant account information when necessary to maintain the truthfulness, accuracy, or reliability of the&nbsp;information.</p>\n" +
                "<ol start=\"11\">\n" +
                "<li><strong><br>\n" +
                "REVIEWS, COMMENTS, COMMUNICATIONS, AND OTHER CONTENT</strong></li>\n" +
                "</ol>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>Registered Users of the Site may post reviews and comments of a product or service purchased via the Site, so long as the Content is not illegal, obscene,&nbsp;threatening, defamatory, an invasive of privacy, infringing of intellectual property rights, or otherwise injurious to third parties or objectionable and&nbsp;does not consist of or contain commercial solicitation, mass mailings, or any form of “spam.” You may not use another User’s account to impersonate a User&nbsp;or entity, or otherwise mislead as to the origin of the remarks. ELECTRONIKZ.COM reserves the right (but is not obligated) to remove or edit such Content,&nbsp;but does not regularly review posted Content.</p>\n" +
                "<p>If you post a review or submit comments, and unless ELECTRONIKZ.COM indicates otherwise, you grant ELECTRONIKZ.COM a nonexclusive, royalty-free, perpetual,&nbsp;irrevocable, and fully sublicensable right to use, reproduce, modify, adapt, publish, translate, create derivative works from, distribute, and display such&nbsp;content throughout the world, in any media. You grant ELECTRONIKZ.COM and sublicensees the right to use your name in connection with such Content, if they&nbsp;choose. You represent and warrant that You own or otherwise control all of the rights to the content that You post; that the content is accurate; that use&nbsp;of the content You supply does not violate this policy and will not cause injury to any person or entity; and that You will indemnify ELECTRONIKZ.COM for all &nbsp;claims resulting from Content You supply. ELECTRONIKZ.COM has the right but not the obligation to monitor and edit or remove any activity or Content. ELECTRONIKZ.COM takes no responsibility and assumes no liability for any content posted by You or any third party.</p>\n" +
                "<ol start=\"12\">\n" +
                "<li><strong><br>\n" +
                "DISCLAIMER OF WARRANTIES AND LIMITATION OF LIABILITY</strong></li>\n" +
                "</ol>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>The Site acts as a venue for Users to purchase unique products or services. Neither ELECTRONIKZ.COM nor the Site has control over the quality or fitness for&nbsp;a particular purpose of a product. ELECTRONIKZ.COM also has no control over the accuracy, reliability, completeness, or timeliness of the User-submitted&nbsp;information and makes no representations or warranties about any information on the Site<br>\n" +
                "THE SITE AND ALL INFORMATION, CONTENT, MATERIALS, PRODUCTS (INCLUDING SOFTWARE) AND SERVICES INCLUDED ON OR OTHERWISE MADE AVAILABLE TO YOU THROUGH THIS&nbsp;SITE ARE PROVIDED BY ELECTRONIKZ.COM ON AN “AS IS” AND “AS AVAILABLE” BASIS, UNLESS OTHERWISE SPECIFIED IN WRITING. ELECTRONIKZ.COM MAKES NO REPRESENTATIONS OR&nbsp;WARRANTIES OF ANY KIND, EXPRESS OR IMPLIED, AS TO THE OPERATION OF THIS SITE OR THE INFORMATION, CONTENT, MATERIALS, PRODUCTS (INCLUDING SOFTWARE) OR&nbsp;SERVICES INCLUDED ON OR OTHERWISE MADE AVAILABLE TO YOU THROUGH THIS SITE, UNLESS OTHERWISE SPECIFIED IN WRITING. YOU EXPRESSLY AGREE THAT YOUR USE OF THIS&nbsp;SITE IS AT YOUR SOLE RISK.</p>\n" +
                "<p>TO THE FULL EXTENT PERMISSIBLE BY APPLICABLE LAW, ELECTRONIKZ.COM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, IMPLIED&nbsp;WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. ELECTRONIKZ.COM DOES NOT WARRANT THAT THIS SITE; INFORMATION, CONTENT, MATERIALS,&nbsp;PRODUCTS (INCLUDING SOFTWARE) OR SERVICES INCLUDED ON OR OTHERWISE MADE AVAILABLE TO YOU THROUGH THE SITE; ITS SERVERS; OR EMAIL SENT FROM ELECTRONIKZ.COM&nbsp;ARE FREE OF VIRUSES OR OTHER HARMFUL COMPONENTS. ELECTRONIKZ.COM WILL NOT BE LIABLE FOR ANY DAMAGES OF ANY KIND ARISING FROM THE USE OF THE SITE OR FROM ANY&nbsp;INFORMATION, CONTENT, MATERIALS, PRODUCTS (INCLUDING SOFTWARE) OR SERVICES INCLUDED ON OR OTHERWISE MADE AVAILABLE TO YOU THROUGH THIS SITE, INCLUDING, BUT&nbsp;NOT LIMITED TO DIRECT, INDIRECT, INCIDENTAL, PUNITIVE, AND CONSEQUENTIAL DAMAGES, UNLESS OTHERWISE SPECIFIED IN WRITING. UNDER NO CIRCUMSTANCE SHALL ELECTRONIKZ.COM’S LIABILITY ARISING OUT OF OR IN CONNECTION WITH THE SITE OR YOUR USE OF THE SITE, REGARDLESS OF THE CAUSE OF ACTION (WHETHER IN CONTRACT, TORT,&nbsp;BREACH OF WARRANTY OR OTHERWISE), EXCEED $100.</p>\n" +
                "<ol start=\"13\">\n" +
                "<li><strong><br>\n" +
                "INDEMNITY</strong></li>\n" +
                "</ol>\n" +
                "<p>You agree to defend, indemnify, and hold harmless ELECTRONIKZ.COM, its affiliates, and their respective officers, directors, employees and agents, from and<br>\n" +
                "against any claims, actions or demands, including without limitation reasonable legal, accounting, and other service provider fees, alleging or resulting<br>\n" +
                "from (i) any Content of other material You provide to the Site, (ii) Your use of any Content, or (iii) Your breach of the terms of these Terms. MATURE<br>\n" +
                "COLORS shall provide notice to You promptly of any such claim, suit, or proceeding.</p>\n" +
                "<ol start=\"14\">\n" +
                "<li><strong> APPLICABLE LAW</strong></li>\n" +
                "</ol>\n" +
                "<p>By using the Site, you agree that the laws of the State of Florida, without regard to principles of conflict of laws, will govern these Terms of Use and<br>\n" +
                "any dispute of any sort that might arise between you and ELECTRONIKZ.COM.</p>\n" +
                "<ol start=\"15\">\n" +
                "<li><strong><br>\n" +
                "DISPUTES</strong></li>\n" +
                "</ol>\n" +
                "<p>Any dispute relating in any way to Your visit to the Site or to services obtained through the Site shall be adjudicated in any state or federal court<br>\n" +
                "having jurisdiction over Miami-Dade County, Florida, and You consent to exclusive jurisdiction and venue in such courts.</p>\n" +
                "<ol start=\"16\">\n" +
                "<li><strong><br>\n" +
                "SITE POLICIES, MODIFICATION, AND SEVERABILITY</strong></li>\n" +
                "</ol>\n" +
                "<p>Please review our Privacy Policy also posted on the Site. This policy also governs your use of the Site and is incorporated by reference as part of the<br>\n" +
                "Terms of Use for the Site. ELECTRONIKZ.COM reserves the right to make changes to the Site, policies, and these Terms of Use at any time. If any of these<br>\n" +
                "conditions shall be deemed invalid, void, or for any reason unenforceable, that condition shall be deemed severable and shall not affect the validity and<br>\n" +
                "enforceability of any remaining conditions.</p>\n" +
                "<ol start=\"17\">\n" +
                "<li><strong><br>\n" +
                "OUR ADDRESS</strong></li>\n" +
                "</ol>\n" +
                "<p>Electronikz.com<br>\n" +
                "27 The Moorings,<br>\n" +
                "Prince Regent Lane<br>\n" +
                "London, E163JN</p>\n" +
                "<p>&nbsp;</p>";

        model.addAttribute("text",policy);
        model.addAttribute("title","Privacy Policy");

        return "page";
    }

}
